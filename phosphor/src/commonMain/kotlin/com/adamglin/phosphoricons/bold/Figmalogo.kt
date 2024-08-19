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

public val BoldGroup.Figmalogo: ImageVector
    get() {
        if (_figmalogo != null) {
            return _figmalogo!!
        }
        _figmalogo = Builder(name = "Figmalogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.15f, 96.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 168.0f, 20.0f)
                lineTo(96.0f, 20.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 65.85f, 96.0f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, 1.23f, 65.12f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 148.0f, 196.0f)
                lineTo(148.0f, 167.17f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 198.15f, 96.0f)
                close()
                moveTo(188.0f, 64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(148.0f, 84.0f)
                lineTo(148.0f, 44.0f)
                horizontalLineToRelative(20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 188.0f, 64.0f)
                close()
                moveTo(76.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 96.0f, 44.0f)
                horizontalLineToRelative(28.0f)
                lineTo(124.0f, 84.0f)
                lineTo(96.0f, 84.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 76.0f, 64.0f)
                close()
                moveTo(96.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(40.0f)
                lineTo(96.0f, 148.0f)
                close()
                moveTo(124.0f, 196.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(168.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 168.0f, 148.0f)
                close()
            }
        }
        .build()
        return _figmalogo!!
    }

private var _figmalogo: ImageVector? = null
