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

public val ThinGroup.`Snowflake-thin`: ImageVector
    get() {
        if (`_snowflake-thin` != null) {
            return `_snowflake-thin`!!
        }
        `_snowflake-thin` = Builder(name = "Snowflake-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.88f, 151.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.93f, 4.83f)
                lineToRelative(-28.6f, 7.0f)
                lineTo(195.86f, 191.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, 4.9f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, true, -1.0f, 0.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, -3.0f)
                lineTo(180.0f, 162.64f)
                lineToRelative(-48.0f, -27.71f)
                verticalLineToRelative(55.41f)
                lineToRelative(22.83f, 22.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(128.0f, 197.66f)
                lineToRelative(-21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(124.0f, 190.34f)
                verticalLineTo(134.93f)
                lineTo(76.0f, 162.64f)
                lineTo(67.86f, 193.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 196.0f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, true, -1.0f, -0.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, -4.9f)
                lineToRelative(7.51f, -28.05f)
                lineToRelative(-28.6f, -7.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 41.0f, 148.12f)
                lineToRelative(31.0f, 7.61f)
                lineTo(120.0f, 128.0f)
                lineTo(72.0f, 100.27f)
                lineToRelative(-31.0f, 7.61f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -1.0f, 0.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, -7.88f)
                lineToRelative(28.6f, -7.0f)
                lineTo(60.14f, 65.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 67.86f, 63.0f)
                lineTo(76.0f, 93.36f)
                lineToRelative(48.0f, 27.71f)
                verticalLineTo(65.66f)
                lineTo(101.17f, 42.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(128.0f, 58.34f)
                lineToRelative(21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineTo(132.0f, 65.66f)
                verticalLineToRelative(55.41f)
                lineToRelative(48.0f, -27.71f)
                lineTo(188.14f, 63.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 195.86f, 65.0f)
                lineToRelative(-7.51f, 28.05f)
                lineToRelative(28.6f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 108.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -1.0f, -0.12f)
                lineToRelative(-31.0f, -7.61f)
                lineTo(136.0f, 128.0f)
                lineToRelative(48.0f, 27.73f)
                lineToRelative(31.0f, -7.61f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.88f, 151.05f)
                close()
            }
        }
        .build()
        return `_snowflake-thin`!!
    }

private var `_snowflake-thin`: ImageVector? = null
