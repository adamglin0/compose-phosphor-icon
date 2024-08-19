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

public val ThinGroup.`Onigiri-thin`: ImageVector
    get() {
        if (`_onigiri-thin` != null) {
            return `_onigiri-thin`!!
        }
        `_onigiri-thin` = Builder(name = "Onigiri-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.11f, 148.63f)
                lineToRelative(-55.88f, -96.0f)
                lineToRelative(-0.06f, -0.09f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -88.34f, 0.0f)
                lineToRelative(-0.06f, 0.09f)
                lineToRelative(-55.88f, 96.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 72.09f, 228.0f)
                lineTo(183.91f, 228.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 44.2f, -79.37f)
                close()
                moveTo(164.0f, 220.0f)
                lineTo(92.0f, 220.0f)
                lineTo(92.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(222.36f, 197.39f)
                arcTo(43.43f, 43.43f, 0.0f, false, true, 183.91f, 220.0f)
                lineTo(172.0f, 220.0f)
                lineTo(172.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(96.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                lineTo(72.09f, 220.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -37.37f, -67.2f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, 0.05f, -0.1f)
                lineTo(90.65f, 56.75f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 74.7f, 0.0f)
                lineToRelative(55.88f, 95.95f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, 0.05f, 0.1f)
                arcTo(43.43f, 43.43f, 0.0f, false, true, 222.35f, 197.39f)
                close()
            }
        }
        .build()
        return `_onigiri-thin`!!
    }

private var `_onigiri-thin`: ImageVector? = null
