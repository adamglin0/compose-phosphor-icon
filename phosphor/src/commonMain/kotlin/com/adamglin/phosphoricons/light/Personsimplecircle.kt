package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Personsimplecircle: ImageVector
    get() {
        if (_personsimplecircle != null) {
            return _personsimplecircle!!
        }
        _personsimplecircle = Builder(name = "Personsimplecircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(114.0f, 80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 114.0f, 80.0f)
                close()
                moveTo(182.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(134.0f, 118.0f)
                verticalLineToRelative(16.18f)
                lineToRelative(31.0f, 46.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.0f, 6.66f)
                lineToRelative(-27.0f, -40.51f)
                lineToRelative(-27.0f, 40.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.0f, -6.66f)
                lineToRelative(31.0f, -46.49f)
                lineTo(122.0f, 118.0f)
                lineTo(80.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 112.0f)
                close()
            }
        }
        .build()
        return _personsimplecircle!!
    }

private var _personsimplecircle: ImageVector? = null
