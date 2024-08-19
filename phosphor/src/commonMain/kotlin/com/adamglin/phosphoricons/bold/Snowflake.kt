package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.65f, 149.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.79f, 14.51f)
                lineToRelative(-20.67f, 5.08f)
                lineToRelative(5.4f, 20.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -23.18f, 6.22f)
                lineToRelative(-7.29f, -27.2f)
                lineTo(140.0f, 148.78f)
                verticalLineTo(187.0f)
                lineToRelative(20.48f, 20.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(128.0f, 209.0f)
                lineToRelative(-15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(116.0f, 187.0f)
                verticalLineTo(148.78f)
                lineTo(82.88f, 167.91f)
                lineToRelative(-7.29f, 27.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -23.18f, -6.22f)
                lineToRelative(5.4f, -20.16f)
                lineToRelative(-20.67f, -5.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 5.72f, -23.3f)
                lineToRelative(27.89f, 6.85f)
                lineTo(104.0f, 128.0f)
                lineTo(70.75f, 108.8f)
                lineToRelative(-27.89f, 6.85f)
                arcTo(11.8f, 11.8f, 0.0f, false, true, 40.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.85f, -23.65f)
                lineToRelative(20.67f, -5.08f)
                lineToRelative(-5.4f, -20.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.18f, -6.22f)
                lineToRelative(7.29f, 27.2f)
                lineTo(116.0f, 107.21f)
                verticalLineTo(69.0f)
                lineTo(95.52f, 48.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(128.0f, 47.0f)
                lineToRelative(15.51f, -15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                lineTo(140.0f, 69.0f)
                verticalLineToRelative(38.24f)
                lineToRelative(33.12f, -19.12f)
                lineToRelative(7.29f, -27.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.18f, 6.22f)
                lineToRelative(-5.4f, 20.16f)
                lineToRelative(20.67f, 5.08f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 116.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -2.87f, -0.35f)
                lineToRelative(-27.89f, -6.85f)
                lineTo(152.0f, 128.0f)
                lineToRelative(33.25f, 19.2f)
                lineToRelative(27.89f, -6.85f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 227.65f, 149.14f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
