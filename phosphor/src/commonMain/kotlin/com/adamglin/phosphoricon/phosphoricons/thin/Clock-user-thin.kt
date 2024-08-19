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

public val ThinGroup.`Clock-user-thin`: ImageVector
    get() {
        if (`_clock-user-thin` != null) {
            return `_clock-user-thin`!!
        }
        `_clock-user-thin` = Builder(name = "Clock-user-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 72.0f)
                verticalLineToRelative(49.53f)
                lineToRelative(42.21f, -21.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.58f, 7.16f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(4.05f, 4.05f, 0.0f, false, true, 128.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(124.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(227.86f, 223.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.73f, 2.05f)
                curveToRelative(-3.29f, -12.37f, -14.86f, -21.0f, -28.13f, -21.0f)
                reflectiveCurveToRelative(-24.84f, 8.65f, -28.14f, 21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, 3.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -1.0f, -0.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.84f, -4.89f)
                arcTo(36.24f, 36.24f, 0.0f, false, true, 176.5f, 199.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 31.0f, 0.0f)
                arcTo(36.2f, 36.2f, 0.0f, false, true, 227.86f, 223.0f)
                close()
                moveTo(192.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 192.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_clock-user-thin`!!
    }

private var `_clock-user-thin`: ImageVector? = null
