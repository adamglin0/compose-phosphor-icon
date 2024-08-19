package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Gender-intersex-fill`: ImageVector
    get() {
        if (`_gender-intersex-fill` != null) {
            return `_gender-intersex-fill`!!
        }
        `_gender-intersex-fill` = Builder(name = "Gender-intersex-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.91f, 113.72f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -25.63f, -25.63f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 147.91f, 113.72f)
                close()
                moveTo(216.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineTo(200.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 40.0f)
                close()
                moveTo(188.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(152.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 144.0f, 55.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 64.0f)
                horizontalLineToRelative(8.69f)
                lineTo(144.92f, 79.77f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 112.0f, 159.26f)
                verticalLineTo(176.0f)
                horizontalLineTo(92.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 84.0f, 183.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 92.0f, 192.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(15.73f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, 7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(19.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 8.25f, -7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.53f)
                horizontalLineTo(128.0f)
                verticalLineTo(159.26f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 28.24f, -68.18f)
                lineTo(172.0f, 75.31f)
                verticalLineToRelative(8.42f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 179.47f, 92.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 188.0f, 84.0f)
                close()
            }
        }
        .build()
        return `_gender-intersex-fill`!!
    }

private var `_gender-intersex-fill`: ImageVector? = null
