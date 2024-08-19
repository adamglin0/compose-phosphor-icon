package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Feather-light`: ImageVector
    get() {
        if (`_feather-light` != null) {
            return `_feather-light`!!
        }
        `_feather-light` = Builder(name = "Feather-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 80.0f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 132.18f, 36.14f)
                lineTo(62.1f, 105.41f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, 9.9f)
                verticalLineToRelative(74.21f)
                lineTo(27.76f, 219.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(66.48f, 198.0f)
                horizontalLineToRelative(74.21f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(68.83f, -69.63f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.39f, -0.4f)
                arcTo(61.6f, 61.6f, 0.0f, false, false, 238.0f, 80.0f)
                close()
                moveTo(140.64f, 44.64f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 72.0f, 69.36f)
                lineTo(150.48f, 114.0f)
                lineToRelative(37.76f, -37.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineToRelative(-48.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                lineTo(118.0f, 129.52f)
                lineTo(118.0f, 67.0f)
                close()
                moveTo(70.0f, 115.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.56f, -1.39f)
                lineToRelative(35.44f, -35.0f)
                verticalLineToRelative(62.63f)
                lineToRelative(-36.0f, 36.0f)
                close()
                moveTo(142.09f, 185.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.4f, 0.58f)
                lineTo(78.48f, 186.0f)
                lineToRelative(37.76f, -37.75f)
                horizontalLineToRelative(0.0f)
                lineTo(138.48f, 126.0f)
                horizontalLineToRelative(62.35f)
                close()
            }
        }
        .build()
        return `_feather-light`!!
    }

private var `_feather-light`: ImageVector? = null
