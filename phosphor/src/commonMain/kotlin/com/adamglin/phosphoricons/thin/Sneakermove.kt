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

public val ThinGroup.Sneakermove: ImageVector
    get() {
        if (_sneakermove != null) {
            return _sneakermove!!
        }
        _sneakermove = Builder(name = "Sneakermove", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.37f, 170.21f)
                lineTo(200.75f, 155.9f)
                arcTo(51.7f, 51.7f, 0.0f, false, true, 172.0f, 109.39f)
                lineTo(172.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.42f, -3.19f)
                lineToRelative(-77.0f, 58.41f)
                lineToRelative(-0.1f, 0.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.94f, 17.81f)
                lineTo(145.23f, 210.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, 1.17f)
                lineTo(224.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 180.94f)
                arcTo(11.94f, 11.94f, 0.0f, false, false, 229.37f, 170.21f)
                close()
                moveTo(228.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(149.72f, 204.0f)
                lineTo(37.17f, 91.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.27f, -5.9f)
                lineToRelative(15.79f, -12.0f)
                lineToRelative(41.26f, 41.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, -5.66f)
                lineTo(59.67f, 68.7f)
                lineToRelative(48.82f, -37.0f)
                arcTo(60.12f, 60.12f, 0.0f, false, false, 164.0f, 83.87f)
                verticalLineToRelative(25.52f)
                arcToRelative(59.68f, 59.68f, 0.0f, false, false, 33.17f, 53.67f)
                lineToRelative(28.62f, 14.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.21f, 3.57f)
                close()
                moveTo(70.8f, 180.0f)
                lineTo(32.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(70.8f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                close()
                moveTo(106.8f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(54.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 106.8f, 208.0f)
                close()
            }
        }
        .build()
        return _sneakermove!!
    }

private var _sneakermove: ImageVector? = null
