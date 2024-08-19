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

public val ThinGroup.`Crown-thin`: ImageVector
    get() {
        if (`_crown-thin` != null) {
            return `_crown-thin`!!
        }
        `_crown-thin` = Builder(name = "Crown-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -42.0f, 15.83f)
                lineTo(169.0f, 136.37f)
                lineTo(141.1f, 72.09f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -26.2f, 0.0f)
                lineTo(87.0f, 136.37f)
                lineTo(54.0f, 95.83f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 35.94f, 104.0f)
                lineToRelative(15.0f, 90.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.84f, 10.0f)
                horizontalLineTo(193.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.84f, -10.0f)
                lineToRelative(15.0f, -90.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 244.0f, 80.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(20.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 36.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 20.0f, 80.0f)
                close()
                moveTo(197.17f, 192.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.95f, 3.34f)
                horizontalLineTo(62.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.34f)
                lineToRelative(-15.0f, -90.0f)
                arcToRelative(23.41f, 23.41f, 0.0f, false, false, 4.0f, -1.8f)
                lineTo(84.9f, 146.52f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 88.0f, 148.0f)
                arcToRelative(3.27f, 3.27f, 0.0f, false, false, 0.54f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.13f, -2.37f)
                lineToRelative(30.56f, -70.3f)
                arcToRelative(23.8f, 23.8f, 0.0f, false, false, 11.54f, 0.0f)
                lineToRelative(30.56f, 70.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.13f, 2.37f)
                arcToRelative(3.27f, 3.27f, 0.0f, false, false, 0.54f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.1f, -1.48f)
                lineToRelative(37.09f, -45.64f)
                arcToRelative(23.41f, 23.41f, 0.0f, false, false, 4.0f, 1.8f)
                close()
                moveTo(220.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 220.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_crown-thin`!!
    }

private var `_crown-thin`: ImageVector? = null
