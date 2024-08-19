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

public val ThinGroup.Bread: ImageVector
    get() {
        if (_bread != null) {
            return _bread!!
        }
        _bread = Builder(name = "Bread", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                lineTo(48.0f, 44.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -12.0f, 69.94f)
                lineTo(36.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 113.94f)
                arcTo(36.07f, 36.07f, 0.0f, false, false, 236.0f, 80.0f)
                close()
                moveTo(44.0f, 200.0f)
                lineTo(44.0f, 115.77f)
                arcToRelative(35.22f, 35.22f, 0.0f, false, false, 4.0f, 0.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(35.22f, 35.22f, 0.0f, false, false, 4.0f, -0.23f)
                lineTo(148.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 200.0f)
                close()
                moveTo(200.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(35.22f, 35.22f, 0.0f, false, false, 4.0f, -0.23f)
                lineTo(204.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(155.3f, 204.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 0.7f, -4.0f)
                lineTo(156.0f, 113.94f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 166.59f, 52.0f)
                lineTo(200.0f, 52.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
            }
        }
        .build()
        return _bread!!
    }

private var _bread: ImageVector? = null
