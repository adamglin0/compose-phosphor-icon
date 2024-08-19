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

public val ThinGroup.`Wheelchair-motion-thin`: ImageVector
    get() {
        if (`_wheelchair-motion-thin` != null) {
            return `_wheelchair-motion-thin`!!
        }
        `_wheelchair-motion-thin` = Builder(name = "Wheelchair-motion-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 176.0f, 76.0f)
                close()
                moveTo(176.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 28.0f)
                close()
                moveTo(164.0f, 168.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, -60.0f, -60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 52.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(203.09f, 133.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.83f, 3.32f)
                lineToRelative(-16.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 184.0f, 220.0f)
                arcToRelative(3.44f, 3.44f, 0.0f, false, true, -0.78f, -0.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.14f, -4.7f)
                lineToRelative(15.0f, -75.22f)
                lineTo(128.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.47f, -6.0f)
                lineToRelative(22.08f, -38.42f)
                arcToRelative(84.05f, 84.05f, 0.0f, false, false, -96.06f, 7.61f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 45.45f, 97.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 108.73f, -6.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.29f, 5.34f)
                lineTo(134.91f, 132.0f)
                lineTo(200.0f, 132.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 203.09f, 133.46f)
                close()
            }
        }
        .build()
        return `_wheelchair-motion-thin`!!
    }

private var `_wheelchair-motion-thin`: ImageVector? = null
