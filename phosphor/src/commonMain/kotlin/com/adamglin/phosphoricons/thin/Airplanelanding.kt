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

public val ThinGroup.Airplanelanding: ImageVector
    get() {
        if (_airplanelanding != null) {
            return _airplanelanding!!
        }
        _airplanelanding = Builder(name = "Airplanelanding", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(104.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(248.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 216.0f)
                close()
                moveTo(230.92f, 187.85f)
                lineTo(54.29f, 138.4f)
                arcTo(36.12f, 36.12f, 0.0f, false, true, 28.0f, 103.73f)
                lineTo(28.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 43.79f, 36.63f)
                lineToRelative(5.48f, 1.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.49f, 2.44f)
                lineTo(63.07f, 72.18f)
                lineTo(100.0f, 82.71f)
                lineTo(100.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.79f, -11.38f)
                lineToRelative(5.48f, 1.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.42f, 2.25f)
                lineToRelative(23.25f, 55.42f)
                lineToRelative(62.7f, 17.52f)
                arcTo(36.1f, 36.1f, 0.0f, false, true, 236.0f, 148.33f)
                lineTo(236.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.08f, 3.85f)
                close()
                moveTo(228.0f, 148.33f)
                arcToRelative(28.07f, 28.07f, 0.0f, false, false, -20.51f, -27.0f)
                lineToRelative(-64.57f, -18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.61f, -2.31f)
                lineTo(117.0f, 45.47f)
                lineToRelative(-3.75f, -1.25f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 48.0f)
                lineTo(108.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.1f, 3.85f)
                lineToRelative(-44.0f, -12.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.66f, -2.49f)
                lineTo(44.9f, 45.43f)
                lineToRelative(-3.64f, -1.21f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, false, -3.6f, 0.55f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 48.0f)
                verticalLineToRelative(55.72f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 20.45f, 27.0f)
                lineToRelative(171.55f, 48.0f)
                close()
            }
        }
        .build()
        return _airplanelanding!!
    }

private var _airplanelanding: ImageVector? = null
