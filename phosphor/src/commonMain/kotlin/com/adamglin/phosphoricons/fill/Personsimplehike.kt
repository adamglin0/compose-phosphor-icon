package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) {
            return _personSimpleHike!!
        }
        _personSimpleHike = Builder(name = "PersonSimpleHike", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 120.0f, 48.0f)
                close()
                moveTo(192.0f, 136.0f)
                curveToRelative(-23.37f, 0.0f, -28.92f, -8.56f, -36.6f, -20.4f)
                curveToRelative(-3.65f, -5.64f, -7.79f, -12.0f, -14.16f, -17.55f)
                arcToRelative(40.92f, 40.92f, 0.0f, false, false, -8.0f, -5.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, 3.92f)
                lineTo(64.66f, 228.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.15f, 10.52f)
                arcTo(7.84f, 7.84f, 0.0f, false, false, 72.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.34f, -4.81f)
                lineToRelative(33.59f, -77.27f)
                lineTo(144.0f, 180.12f)
                lineTo(144.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(160.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.35f, -6.51f)
                lineToRelative(-37.2f, -26.57f)
                lineToRelative(13.4f, -30.81f)
                curveToRelative(3.57f, 3.62f, 6.28f, 7.8f, 9.13f, 12.19f)
                curveToRelative(7.67f, 11.84f, 16.27f, 25.11f, 42.0f, 27.36f)
                lineTo(183.98f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(199.98f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 136.0f)
                close()
                moveTo(72.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.36f, -4.85f)
                lineToRelative(24.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.2f, -10.5f)
                lineToRelative(-28.0f, -12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.5f, 4.2f)
                lineToRelative(-24.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 10.5f)
                lineToRelative(28.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 152.0f)
                close()
            }
        }
        .build()
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
