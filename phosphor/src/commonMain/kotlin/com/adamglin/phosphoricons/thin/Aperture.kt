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

public val ThinGroup.Aperture: ImageVector
    get() {
        if (_aperture != null) {
            return _aperture!!
        }
        _aperture = Builder(name = "Aperture", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.71f, 57.29f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 57.29f, 198.71f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 198.71f, 57.29f)
                close()
                moveTo(209.08f, 171.56f)
                lineTo(148.08f, 160.42f)
                lineTo(210.4f, 87.0f)
                arcToRelative(92.26f, 92.26f, 0.0f, false, true, -1.32f, 84.52f)
                close()
                moveTo(95.87f, 122.13f)
                lineTo(117.0f, 97.24f)
                lineToRelative(32.14f, 5.86f)
                lineToRelative(11.0f, 30.77f)
                lineTo(139.0f, 158.76f)
                lineToRelative(-32.14f, -5.86f)
                close()
                moveTo(206.24f, 79.58f)
                lineToRelative(-40.13f, 47.25f)
                lineTo(133.75f, 36.2f)
                arcToRelative(92.09f, 92.09f, 0.0f, false, true, 72.49f, 43.38f)
                close()
                moveTo(63.0f, 63.0f)
                arcToRelative(91.31f, 91.31f, 0.0f, false, true, 62.26f, -26.88f)
                lineTo(146.0f, 94.41f)
                lineTo(51.32f, 77.11f)
                arcTo(92.94f, 92.94f, 0.0f, false, true, 63.0f, 63.0f)
                close()
                moveTo(47.0f, 84.49f)
                lineTo(108.0f, 95.63f)
                lineTo(45.6f, 169.0f)
                arcToRelative(92.26f, 92.26f, 0.0f, false, true, 1.32f, -84.52f)
                close()
                moveTo(49.84f, 176.49f)
                lineTo(89.97f, 129.24f)
                lineTo(122.33f, 219.87f)
                arcToRelative(92.09f, 92.09f, 0.0f, false, true, -72.49f, -43.38f)
                close()
                moveTo(193.13f, 193.12f)
                arcToRelative(91.31f, 91.31f, 0.0f, false, true, -62.26f, 26.88f)
                lineTo(110.0f, 161.59f)
                lineToRelative(94.72f, 17.3f)
                arcTo(92.94f, 92.94f, 0.0f, false, true, 193.05f, 193.05f)
                close()
            }
        }
        .build()
        return _aperture!!
    }

private var _aperture: ImageVector? = null
