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

public val BoldGroup.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) {
            return _slidersHorizontal!!
        }
        _slidersHorizontal = Builder(name = "SlidersHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 92.0f)
                lineTo(70.06f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 67.88f, 0.0f)
                lineTo(216.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(137.94f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -67.88f, 0.0f)
                lineTo(40.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(104.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 92.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 68.0f)
                close()
                moveTo(216.0f, 164.0f)
                lineTo(201.94f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -67.88f, 0.0f)
                lineTo(40.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(94.06f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 67.88f, 0.0f)
                lineTo(216.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(168.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 188.0f)
                close()
            }
        }
        .build()
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
