package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Currency-ngn-bold`: ImageVector
    get() {
        if (`_currency-ngn-bold` != null) {
            return `_currency-ngn-bold`!!
        }
        `_currency-ngn-bold` = Builder(name = "Currency-ngn-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 116.0f)
                lineTo(204.0f, 116.0f)
                lineTo(204.0f, 46.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(70.0f)
                lineTo(133.86f, 116.0f)
                lineTo(73.46f, 38.62f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 46.0f)
                verticalLineToRelative(70.0f)
                lineTo(40.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(52.0f, 140.0f)
                verticalLineToRelative(70.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(76.0f, 140.0f)
                horizontalLineToRelative(46.14f)
                lineToRelative(60.4f, 77.38f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 204.0f, 210.0f)
                lineTo(204.0f, 140.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(76.0f, 116.0f)
                lineTo(76.0f, 80.88f)
                lineTo(103.41f, 116.0f)
                close()
                moveTo(180.0f, 175.12f)
                lineTo(152.59f, 140.0f)
                lineTo(180.0f, 140.0f)
                close()
            }
        }
        .build()
        return `_currency-ngn-bold`!!
    }

private var `_currency-ngn-bold`: ImageVector? = null
