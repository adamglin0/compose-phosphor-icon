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

public val LightGroup.`Moped-front-light`: ImageVector
    get() {
        if (`_moped-front-light` != null) {
            return `_moped-front-light`!!
        }
        `_moped-front-light` = Builder(name = "Moped-front-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 42.0f)
                lineTo(165.52f, 42.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -75.0f, 0.0f)
                lineTo(48.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(90.48f, 54.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 14.71f, 24.37f)
                arcTo(62.09f, 62.09f, 0.0f, false, false, 66.0f, 136.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(98.0f, 214.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(190.0f, 136.0f)
                arcToRelative(62.09f, 62.09f, 0.0f, false, false, -39.19f, -57.63f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 165.52f, 54.0f)
                lineTo(208.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(146.0f, 216.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                lineTo(110.0f, 168.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                close()
                moveTo(178.0f, 136.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(158.0f, 202.0f)
                lineTo(158.0f, 168.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -60.0f, 0.0f)
                verticalLineToRelative(34.0f)
                lineTo(80.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(78.0f, 136.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 100.0f, 0.0f)
                close()
                moveTo(128.0f, 74.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 74.0f)
                close()
            }
        }
        .build()
        return `_moped-front-light`!!
    }

private var `_moped-front-light`: ImageVector? = null
