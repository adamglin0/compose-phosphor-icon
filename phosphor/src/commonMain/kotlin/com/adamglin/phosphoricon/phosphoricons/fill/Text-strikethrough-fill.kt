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

public val FillGroup.`Text-strikethrough-fill`: ImageVector
    get() {
        if (`_text-strikethrough-fill` != null) {
            return `_text-strikethrough-fill`!!
        }
        `_text-strikethrough-fill` = Builder(name = "Text-strikethrough-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(82.71f, 94.58f)
                curveTo(86.0f, 76.57f, 104.58f, 64.0f, 128.0f, 64.0f)
                curveToRelative(18.2f, 0.0f, 33.59f, 7.41f, 41.18f, 19.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.66f, 8.34f)
                curveTo(150.94f, 84.66f, 140.39f, 80.0f, 128.0f, 80.0f)
                curveToRelative(-15.3f, 0.0f, -27.73f, 7.33f, -29.55f, 17.42f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 90.59f, 104.0f)
                arcToRelative(7.76f, 7.76f, 0.0f, false, true, -1.43f, -0.13f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 82.71f, 94.58f)
                close()
                moveTo(192.0f, 136.0f)
                horizontalLineTo(168.29f)
                arcTo(28.45f, 28.45f, 0.0f, false, true, 176.0f, 156.0f)
                curveToRelative(0.0f, 20.19f, -21.08f, 36.0f, -48.0f, 36.0f)
                curveToRelative(-23.89f, 0.0f, -43.83f, -12.78f, -47.43f, -30.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.67f, -3.2f)
                curveToRelative(2.0f, 9.87f, 16.0f, 17.6f, 31.76f, 17.6f)
                curveToRelative(17.35f, 0.0f, 32.0f, -9.16f, 32.0f, -20.0f)
                curveToRelative(0.0f, -9.14f, -6.76f, -14.43f, -25.72f, -20.0f)
                horizontalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_text-strikethrough-fill`!!
    }

private var `_text-strikethrough-fill`: ImageVector? = null
