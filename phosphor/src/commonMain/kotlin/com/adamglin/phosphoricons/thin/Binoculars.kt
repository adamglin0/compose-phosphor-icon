package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.22f, 148.09f)
                lineTo(189.6f, 53.41f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, -0.83f, -1.22f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 148.0f, 55.0f)
                lineTo(148.0f, 84.0f)
                lineTo(108.0f, 84.0f)
                lineTo(108.0f, 55.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, -0.83f, 1.22f)
                lineTo(24.78f, 148.09f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 108.0f, 168.0f)
                lineTo(108.0f, 92.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 83.22f, -19.91f)
                close()
                moveTo(64.0f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 64.0f, 204.0f)
                close()
                moveTo(64.0f, 124.0f)
                arcToRelative(43.78f, 43.78f, 0.0f, false, false, -22.66f, 6.3f)
                lineTo(73.4f, 57.35f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 26.6f, -0.59f)
                verticalLineToRelative(86.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 64.0f, 124.0f)
                close()
                moveTo(156.0f, 56.77f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 26.6f, 0.59f)
                lineToRelative(32.06f, 72.94f)
                arcTo(43.92f, 43.92f, 0.0f, false, false, 156.0f, 142.74f)
                close()
                moveTo(192.0f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 192.0f, 204.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
