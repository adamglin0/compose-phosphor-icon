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

public val BoldGroup.`Train-regional-bold`: ImageVector
    get() {
        if (`_train-regional-bold` != null) {
            return `_train-regional-bold`!!
        }
        `_train-regional-bold` = Builder(name = "Train-regional-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.58f, 116.84f)
                lineToRelative(-22.4f, -82.1f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 185.89f, 20.0f)
                horizontalLineTo(70.11f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 50.82f, 34.74f)
                lineToRelative(-22.4f, 82.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, 6.32f)
                lineToRelative(22.4f, 82.1f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 70.11f, 220.0f)
                horizontalLineTo(72.0f)
                lineToRelative(-9.6f, 12.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 19.2f, 14.4f)
                lineTo(102.0f, 220.0f)
                horizontalLineToRelative(52.0f)
                lineToRelative(20.4f, 27.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.2f, -14.4f)
                lineTo(184.0f, 220.0f)
                horizontalLineToRelative(1.89f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.29f, -14.74f)
                lineToRelative(22.4f, -82.1f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 227.58f, 116.84f)
                close()
                moveTo(73.17f, 44.0f)
                horizontalLineTo(182.83f)
                lineTo(201.0f, 110.53f)
                lineTo(128.0f, 123.8f)
                lineTo(55.0f, 110.53f)
                close()
                moveTo(56.59f, 135.21f)
                lineTo(116.0f, 146.0f)
                verticalLineToRelative(50.0f)
                horizontalLineTo(73.17f)
                close()
                moveTo(182.83f, 196.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(146.0f)
                lineToRelative(59.41f, -10.8f)
                close()
                moveTo(84.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 76.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 88.0f)
                close()
            }
        }
        .build()
        return `_train-regional-bold`!!
    }

private var `_train-regional-bold`: ImageVector? = null
