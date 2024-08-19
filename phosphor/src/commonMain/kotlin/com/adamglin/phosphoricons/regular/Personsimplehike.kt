package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Personsimplehike: ImageVector
    get() {
        if (_personsimplehike != null) {
            return _personsimplehike!!
        }
        _personsimplehike = Builder(name = "Personsimplehike", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 152.0f, 80.0f)
                close()
                moveTo(152.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 32.0f)
                close()
                moveTo(200.0f, 144.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(184.0f, 151.66f)
                curveToRelative(-25.75f, -2.25f, -34.35f, -15.52f, -42.0f, -27.36f)
                curveToRelative(-2.85f, -4.39f, -5.56f, -8.57f, -9.13f, -12.19f)
                lineToRelative(-13.4f, 30.81f)
                lineToRelative(37.2f, 26.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 176.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(144.0f, 180.12f)
                lineToRelative(-31.07f, -22.2f)
                lineTo(79.34f, 235.19f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 240.0f)
                arcToRelative(7.84f, 7.84f, 0.0f, false, true, -3.19f, -0.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.14f, -10.52f)
                lineTo(122.19f, 96.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.0f, -3.92f)
                arcToRelative(40.92f, 40.92f, 0.0f, false, true, 8.0f, 5.47f)
                curveToRelative(6.37f, 5.52f, 10.51f, 11.91f, 14.16f, 17.55f)
                curveToRelative(7.68f, 11.84f, 13.22f, 20.4f, 36.6f, 20.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 144.0f)
                close()
                moveTo(72.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.35f, -4.85f)
                lineToRelative(24.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.2f, -10.5f)
                lineToRelative(-28.0f, -12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.5f, 4.2f)
                lineToRelative(-24.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 10.5f)
                lineToRelative(28.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 152.0f)
                close()
                moveTo(54.51f, 127.8f)
                lineTo(72.2f, 86.5f)
                lineToRelative(13.3f, 5.7f)
                lineTo(67.8f, 133.49f)
                close()
            }
        }
        .build()
        return _personsimplehike!!
    }

private var _personsimplehike: ImageVector? = null
