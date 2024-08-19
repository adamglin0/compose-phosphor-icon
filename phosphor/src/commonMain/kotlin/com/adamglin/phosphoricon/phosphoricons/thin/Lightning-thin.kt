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

public val ThinGroup.`Lightning-thin`: ImageVector
    get() {
        if (`_lightning-thin` != null) {
            return `_lightning-thin`!!
        }
        `_lightning-thin` = Builder(name = "Lightning-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.89f, 119.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.49f, -2.84f)
                lineToRelative(-60.81f, -22.8f)
                lineToRelative(15.33f, -76.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.84f, -3.51f)
                lineToRelative(-112.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.0f, 3.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.49f, 2.84f)
                lineToRelative(60.81f, 22.8f)
                lineTo(92.08f, 239.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.84f, 3.51f)
                lineToRelative(112.0f, -120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 211.89f, 119.09f)
                close()
                moveTo(102.68f, 227.0f)
                lineToRelative(13.24f, -66.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.52f, -4.53f)
                lineTo(55.0f, 134.36f)
                lineTo(153.32f, 29.0f)
                lineToRelative(-13.24f, 66.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.52f, 4.53f)
                lineTo(201.0f, 121.64f)
                close()
            }
        }
        .build()
        return `_lightning-thin`!!
    }

private var `_lightning-thin`: ImageVector? = null
