package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Meteor-fill`: ImageVector
    get() {
        if (`_meteor-fill` != null) {
            return `_meteor-fill`!!
        }
        `_meteor-fill` = Builder(name = "Meteor-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 136.0f, 160.0f)
                close()
                moveTo(210.34f, 122.34f)
                lineTo(162.34f, 170.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                close()
                moveTo(189.66f, 109.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                close()
                moveTo(229.66f, 58.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(16.0f, -16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 229.66f, 58.34f)
                close()
                moveTo(122.34f, 101.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(72.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.32f, -11.32f)
                lineToRelative(-72.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 122.34f, 101.66f)
                close()
                moveTo(135.6f, 199.6f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -79.2f, -79.2f)
                lineToRelative(82.75f, -82.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.32f, -11.32f)
                lineTo(45.09f, 109.09f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 146.91f, 210.91f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 135.6f, 199.6f)
                close()
            }
        }
        .build()
        return `_meteor-fill`!!
    }

private var `_meteor-fill`: ImageVector? = null
