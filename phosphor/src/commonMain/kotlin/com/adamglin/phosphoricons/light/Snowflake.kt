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

public val LightGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.83f, 150.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.4f, 7.26f)
                lineToRelative(-26.62f, 6.54f)
                lineToRelative(7.0f, 26.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, 7.35f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -1.55f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.8f, -4.45f)
                lineTo(178.27f, 164.0f)
                lineTo(134.0f, 138.39f)
                verticalLineToRelative(51.13f)
                lineToRelative(22.24f, 22.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(128.0f, 200.49f)
                lineToRelative(-19.76f, 19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(122.0f, 189.52f)
                verticalLineTo(138.39f)
                lineTo(77.73f, 164.0f)
                lineToRelative(-7.93f, 29.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 64.0f, 198.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -1.55f, -0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, -7.35f)
                lineToRelative(7.0f, -26.08f)
                lineToRelative(-26.62f, -6.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.86f, -11.66f)
                lineToRelative(30.23f, 7.43f)
                lineTo(116.0f, 128.0f)
                lineTo(71.66f, 102.4f)
                lineToRelative(-30.23f, 7.43f)
                arcTo(5.88f, 5.88f, 0.0f, false, true, 40.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.43f, -11.83f)
                lineToRelative(26.62f, -6.54f)
                lineToRelative(-7.0f, -26.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.59f, -3.1f)
                lineToRelative(7.93f, 29.6f)
                lineTo(122.0f, 117.61f)
                verticalLineTo(66.48f)
                lineTo(99.76f, 44.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(128.0f, 55.51f)
                lineToRelative(19.76f, -19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(134.0f, 66.48f)
                verticalLineToRelative(51.13f)
                lineToRelative(44.27f, -25.56f)
                lineToRelative(7.93f, -29.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.59f, 3.1f)
                lineToRelative(-7.0f, 26.08f)
                lineToRelative(26.62f, 6.54f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 216.0f, 110.0f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, true, -1.43f, -0.17f)
                lineToRelative(-30.23f, -7.43f)
                lineTo(140.0f, 128.0f)
                lineToRelative(44.34f, 25.6f)
                lineToRelative(30.23f, -7.43f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 221.83f, 150.57f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
