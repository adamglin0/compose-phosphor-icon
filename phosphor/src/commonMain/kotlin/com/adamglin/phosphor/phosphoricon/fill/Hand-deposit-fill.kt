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

public val FillGroup.`Hand-deposit-fill`: ImageVector
    get() {
        if (`_hand-deposit-fill` != null) {
            return `_hand-deposit-fill`!!
        }
        `_hand-deposit-fill` = Builder(name = "Hand-deposit-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 198.65f)
                verticalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(198.65f)
                arcTo(74.84f, 74.84f, 0.0f, false, false, 192.0f, 144.0f)
                verticalLineToRelative(58.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.69f, 4.38f)
                lineToRelative(-10.68f, -16.31f)
                curveToRelative(-0.08f, -0.12f, -0.16f, -0.25f, -0.23f, -0.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.89f, 11.83f)
                lineToRelative(22.13f, 33.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.39f, 8.76f)
                lineToRelative(-22.26f, -34.0f)
                lineToRelative(-0.24f, -0.38f)
                curveToRelative(-0.38f, -0.66f, -0.73f, -1.33f, -1.05f, -2.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 80.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(27.62f)
                arcTo(90.89f, 90.89f, 0.0f, false, true, 232.0f, 198.65f)
                close()
                moveTo(128.0f, 35.31f)
                lineToRelative(18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 93.66f, 53.66f)
                lineTo(112.0f, 35.31f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return `_hand-deposit-fill`!!
    }

private var `_hand-deposit-fill`: ImageVector? = null
