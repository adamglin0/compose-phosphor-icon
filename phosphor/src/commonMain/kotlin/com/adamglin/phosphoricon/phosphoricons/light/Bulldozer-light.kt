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

public val LightGroup.`Bulldozer-light`: ImageVector
    get() {
        if (`_bulldozer-light` != null) {
            return `_bulldozer-light`!!
        }
        `_bulldozer-light` = Builder(name = "Bulldozer-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 202.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(230.0f, 160.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f)
                verticalLineToRelative(10.0f)
                lineTo(197.52f, 170.0f)
                arcToRelative(38.08f, 38.08f, 0.0f, false, false, -33.43f, -31.78f)
                lineToRelative(-36.5f, -87.61f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 114.67f, 42.0f)
                lineTo(24.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 10.0f, 56.0f)
                verticalLineToRelative(96.72f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 40.0f, 214.0f)
                lineTo(160.0f, 214.0f)
                arcToRelative(38.05f, 38.05f, 0.0f, false, false, 37.52f, -32.0f)
                lineTo(218.0f, 182.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(116.51f, 55.23f)
                lineTo(151.0f, 138.0f)
                lineTo(62.0f, 138.0f)
                lineTo(62.0f, 54.0f)
                horizontalLineToRelative(52.67f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 116.51f, 55.23f)
                close()
                moveTo(24.0f, 54.0f)
                lineTo(50.0f, 54.0f)
                verticalLineToRelative(84.0f)
                lineTo(40.0f, 138.0f)
                arcToRelative(37.82f, 37.82f, 0.0f, false, false, -18.0f, 4.54f)
                lineTo(22.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 54.0f)
                close()
                moveTo(160.0f, 202.0f)
                lineTo(40.0f, 202.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, -52.0f)
                lineTo(160.0f, 150.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f)
                close()
                moveTo(166.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(160.0f, 170.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 176.0f)
                close()
            }
        }
        .build()
        return `_bulldozer-light`!!
    }

private var `_bulldozer-light`: ImageVector? = null
