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

public val BoldGroup.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) {
            return _shootingStar!!
        }
        _shootingStar = Builder(name = "ShootingStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.16f, 68.85f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, false, -15.26f, -12.0f)
                lineToRelative(-34.52f, -2.72f)
                lineTo(180.12f, 22.66f)
                arcToRelative(17.52f, 17.52f, 0.0f, false, false, -32.24f, 0.0f)
                lineTo(134.62f, 54.09f)
                lineToRelative(-34.51f, 2.72f)
                arcToRelative(17.39f, 17.39f, 0.0f, false, false, -9.93f, 30.62f)
                lineToRelative(26.17f, 22.1f)
                lineToRelative(-8.0f, 33.0f)
                arcToRelative(17.46f, 17.46f, 0.0f, false, false, 26.0f, 19.0f)
                lineTo(164.0f, 143.66f)
                lineToRelative(29.59f, 17.81f)
                arcToRelative(17.46f, 17.46f, 0.0f, false, false, 26.0f, -19.0f)
                lineToRelative(-8.0f, -33.0f)
                lineToRelative(26.17f, -22.1f)
                arcTo(17.3f, 17.3f, 0.0f, false, false, 243.16f, 68.85f)
                close()
                moveTo(190.5f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.92f, 12.0f)
                lineToRelative(6.0f, 24.91f)
                lineToRelative(-22.41f, -13.5f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, -12.38f, 0.0f)
                lineToRelative(-22.41f, 13.5f)
                lineToRelative(6.0f, -24.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.93f, -12.0f)
                lineTo(118.0f, 79.48f)
                lineToRelative(25.83f, -2.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.11f, -7.3f)
                lineTo(164.0f, 46.2f)
                lineToRelative(10.11f, 23.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.11f, 7.3f)
                lineToRelative(25.82f, 2.0f)
                close()
                moveTo(32.5f, 184.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(51.76f, -51.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(96.09f, 175.95f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-47.59f, 47.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(47.6f, -47.59f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.08f, 175.92f)
                close()
                moveTo(158.53f, 185.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-38.0f, 38.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(38.0f, -38.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 158.52f, 185.48f)
                close()
            }
        }
        .build()
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
