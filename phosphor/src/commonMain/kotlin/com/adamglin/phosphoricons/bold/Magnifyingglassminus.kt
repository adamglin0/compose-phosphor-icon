package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) {
            return _magnifyingGlassMinus!!
        }
        _magnifyingGlassMinus = Builder(name = "MagnifyingGlassMinus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(80.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 112.0f)
                close()
                moveTo(232.49f, 232.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(168.0f, 185.0f)
                arcToRelative(92.12f, 92.12f, 0.0f, true, true, 17.0f, -17.0f)
                lineToRelative(47.54f, 47.53f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.49f, 232.49f)
                close()
                moveTo(112.0f, 180.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -68.0f, -68.0f)
                arcTo(68.08f, 68.08f, 0.0f, false, false, 112.0f, 180.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
