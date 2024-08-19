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

public val LightGroup.Starofdavid: ImageVector
    get() {
        if (_starofdavid != null) {
            return _starofdavid!!
        }
        _starofdavid = Builder(name = "Starofdavid", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.91f, 128.0f)
                lineToRelative(30.3f, -53.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 66.0f)
                lineTo(163.49f, 66.0f)
                lineTo(133.21f, 13.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.42f, 0.0f)
                lineTo(92.5f, 66.0f)
                lineTo(32.0f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.21f, 9.0f)
                lineToRelative(30.28f, 53.0f)
                lineTo(26.79f, 181.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 190.0f)
                lineTo(92.5f, 190.0f)
                lineToRelative(30.29f, 53.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.42f, 0.0f)
                lineToRelative(30.28f, -53.0f)
                lineTo(224.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.21f, -9.0f)
                close()
                moveTo(213.66f, 78.0f)
                lineTo(192.0f, 115.91f)
                lineTo(170.34f, 78.0f)
                close()
                moveTo(185.09f, 128.0f)
                lineTo(156.53f, 178.0f)
                lineTo(99.46f, 178.0f)
                lineTo(70.9f, 128.0f)
                lineTo(99.46f, 78.0f)
                lineToRelative(57.07f, 0.0f)
                close()
                moveTo(128.0f, 28.09f)
                lineTo(149.67f, 66.0f)
                lineTo(106.32f, 66.0f)
                close()
                moveTo(42.34f, 78.0f)
                horizontalLineToRelative(43.3f)
                lineTo(64.0f, 115.91f)
                close()
                moveTo(42.34f, 177.92f)
                lineTo(64.0f, 140.09f)
                lineTo(85.64f, 178.0f)
                close()
                moveTo(128.0f, 227.91f)
                lineTo(106.32f, 190.0f)
                horizontalLineToRelative(43.35f)
                close()
                moveTo(170.34f, 178.0f)
                lineTo(192.0f, 140.09f)
                lineTo(213.66f, 178.0f)
                close()
            }
        }
        .build()
        return _starofdavid!!
    }

private var _starofdavid: ImageVector? = null
