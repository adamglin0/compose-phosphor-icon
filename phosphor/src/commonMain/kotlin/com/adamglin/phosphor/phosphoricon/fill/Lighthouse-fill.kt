package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Lighthouse-fill`: ImageVector
    get() {
        if (`_lighthouse-fill` != null) {
            return `_lighthouse-fill`!!
        }
        `_lighthouse-fill` = Builder(name = "Lighthouse-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(188.85f)
                lineTo(184.0f, 55.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 181.31f, 50.0f)
                horizontalLineToRelative(0.0f)
                lineTo(138.44f, 11.88f)
                lineToRelative(-0.2f, -0.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -20.48f, 0.0f)
                lineToRelative(-0.2f, 0.17f)
                lineTo(74.68f, 50.0f)
                verticalLineToRelative(0.0f)
                arcTo(7.93f, 7.93f, 0.0f, false, false, 72.0f, 55.2f)
                lineTo(67.15f, 104.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(65.54f)
                lineToRelative(-9.47f, 94.48f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 232.0f)
                horizontalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.92f, -17.56f)
                lineTo(190.46f, 120.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 80.0f)
                close()
                moveTo(87.24f, 64.0f)
                horizontalLineToRelative(81.52f)
                lineToRelative(4.0f, 40.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(83.23f)
                close()
                moveTo(72.0f, 216.0f)
                lineToRelative(4.81f, -48.0f)
                horizontalLineTo(179.19f)
                lineTo(184.0f, 216.0f)
                close()
            }
        }
        .build()
        return `_lighthouse-fill`!!
    }

private var `_lighthouse-fill`: ImageVector? = null
