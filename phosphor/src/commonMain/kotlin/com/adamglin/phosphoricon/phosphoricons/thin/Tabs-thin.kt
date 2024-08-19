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

public val ThinGroup.`Tabs-thin`: ImageVector
    get() {
        if (`_tabs-thin` != null) {
            return `_tabs-thin`!!
        }
        `_tabs-thin` = Builder(name = "Tabs-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.81f, 166.86f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-22.29f, -74.3f)
                arcTo(11.92f, 11.92f, 0.0f, false, false, 218.05f, 84.0f)
                lineTo(208.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(10.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.83f, 2.85f)
                lineTo(242.62f, 164.0f)
                lineTo(203.0f, 164.0f)
                lineTo(181.54f, 92.55f)
                arcTo(11.92f, 11.92f, 0.0f, false, false, 170.05f, 84.0f)
                lineTo(160.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(10.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.83f, 2.85f)
                lineTo(194.62f, 164.0f)
                lineTo(155.0f, 164.0f)
                lineTo(133.54f, 92.55f)
                arcTo(11.92f, 11.92f, 0.0f, false, false, 122.05f, 84.0f)
                lineTo(38.0f, 84.0f)
                arcToRelative(11.92f, 11.92f, 0.0f, false, false, -11.49f, 8.55f)
                lineTo(4.17f, 166.85f)
                curveToRelative(0.0f, 0.06f, 0.0f, 0.12f, 0.0f, 0.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 172.0f)
                lineTo(248.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcTo(3.89f, 3.89f, 0.0f, false, false, 251.81f, 166.86f)
                close()
                moveTo(34.12f, 94.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 38.0f, 92.0f)
                horizontalLineToRelative(84.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.83f, 2.85f)
                lineTo(146.62f, 164.0f)
                lineTo(13.38f, 164.0f)
                close()
            }
        }
        .build()
        return `_tabs-thin`!!
    }

private var `_tabs-thin`: ImageVector? = null
