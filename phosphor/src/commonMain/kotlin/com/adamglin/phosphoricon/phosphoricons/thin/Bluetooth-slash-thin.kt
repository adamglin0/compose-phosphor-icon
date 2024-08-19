package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Bluetooth-slash-thin`: ImageVector
    get() {
        if (`_bluetooth-slash-thin` != null) {
            return `_bluetooth-slash-thin`!!
        }
        `_bluetooth-slash-thin` = Builder(name = "Bluetooth-slash-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.0f, 213.31f)
                lineTo(59.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 53.0f, 42.69f)
                lineToRelative(74.0f, 81.42f)
                lineToRelative(-0.14f, 0.0f)
                arcToRelative(5.17f, 5.17f, 0.0f, false, false, -0.51f, 0.18f)
                lineToRelative(-0.15f, 0.06f)
                lineToRelative(-0.05f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.56f, 0.35f)
                lineToRelative(-0.05f, 0.0f)
                lineToRelative(-64.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.8f, 6.4f)
                lineTo(124.0f, 136.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.21f, 3.58f)
                arcTo(4.05f, 4.05f, 0.0f, false, false, 128.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, -0.8f)
                lineToRelative(53.74f, -40.3f)
                lineTo(213.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(132.0f, 216.0f)
                verticalLineTo(136.0f)
                lineToRelative(18.44f, 13.83f)
                lineTo(178.73f, 181.0f)
                close()
                moveTo(124.0f, 71.63f)
                verticalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.4f, -3.2f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 6.4f)
                lineToRelative(-33.53f, 25.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.4f, 0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.4f, -7.2f)
                lineToRelative(29.26f, -22.0f)
                lineTo(132.0f, 40.0f)
                verticalLineTo(71.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_bluetooth-slash-thin`!!
    }

private var `_bluetooth-slash-thin`: ImageVector? = null
