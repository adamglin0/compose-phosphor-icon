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

public val BoldGroup.`House-line-bold`: ImageVector
    get() {
        if (`_house-line-bold` != null) {
            return `_house-line-bold`!!
        }
        `_house-line-bold` = Builder(name = "House-line-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 204.0f)
                horizontalLineTo(228.0f)
                verticalLineTo(144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.49f, -19.78f)
                lineTo(142.14f, 25.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(15.51f, 124.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 144.0f)
                verticalLineToRelative(60.0f)
                horizontalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(52.0f, 121.65f)
                lineToRelative(76.0f, -76.0f)
                lineToRelative(76.0f, 76.0f)
                verticalLineTo(204.0f)
                horizontalLineTo(164.0f)
                verticalLineTo(152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                horizontalLineTo(52.0f)
                close()
                moveTo(140.0f, 204.0f)
                horizontalLineTo(116.0f)
                verticalLineTo(164.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return `_house-line-bold`!!
    }

private var `_house-line-bold`: ImageVector? = null
