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

public val BoldGroup.`Currency-jpy-bold`: ImageVector
    get() {
        if (`_currency-jpy-bold` != null) {
            return `_currency-jpy-bold`!!
        }
        `_currency-jpy-bold` = Builder(name = "Currency-jpy-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.29f, 55.6f)
                lineToRelative(-56.0f, 68.4f)
                horizontalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(140.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(140.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(188.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(36.0f)
                verticalLineTo(148.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(22.68f)
                lineToRelative(-56.0f, -68.4f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 65.29f, 40.4f)
                lineTo(128.0f, 117.05f)
                lineTo(190.71f, 40.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 18.58f, 15.2f)
                close()
            }
        }
        .build()
        return `_currency-jpy-bold`!!
    }

private var `_currency-jpy-bold`: ImageVector? = null
