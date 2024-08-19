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

public val LightGroup.`Microsoft-outlook-logo-light`: ImageVector
    get() {
        if (`_microsoft-outlook-logo-light` != null) {
            return `_microsoft-outlook-logo-light`!!
        }
        `_microsoft-outlook-logo-light` = Builder(name = "Microsoft-outlook-logo-light",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(118.0f, 128.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, 30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 118.0f, 128.0f)
                close()
                moveTo(70.0f, 128.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 70.0f, 128.0f)
                close()
                moveTo(224.0f, 106.0f)
                lineTo(206.0f, 106.0f)
                lineTo(206.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(104.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(98.0f, 66.0f)
                lineTo(40.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(74.0f, 190.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 112.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 106.0f)
                close()
                moveTo(162.25f, 164.0f)
                lineTo(218.0f, 123.73f)
                verticalLineToRelative(80.54f)
                close()
                moveTo(110.0f, 46.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(80.27f)
                lineTo(152.0f, 156.6f)
                lineToRelative(-2.0f, -1.45f)
                lineTo(150.0f, 80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(110.0f, 66.0f)
                close()
                moveTo(38.0f, 176.0f)
                lineTo(38.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 178.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 176.0f)
                close()
                moveTo(86.0f, 208.0f)
                lineTo(86.0f, 190.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(55.44f, 40.0f)
                lineTo(88.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 86.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_microsoft-outlook-logo-light`!!
    }

private var `_microsoft-outlook-logo-light`: ImageVector? = null
