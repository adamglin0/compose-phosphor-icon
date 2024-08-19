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

public val FillGroup.`Gender-transgender-fill`: ImageVector
    get() {
        if (`_gender-transgender-fill` != null) {
            return `_gender-transgender-fill`!!
        }
        `_gender-transgender-fill` = Builder(name = "Gender-transgender-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(127.92f, 150.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -22.0f, -22.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 127.92f, 150.0f)
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
                moveTo(192.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(156.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 148.0f, 71.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 80.0f)
                horizontalLineToRelative(8.69f)
                lineTo(148.0f, 96.69f)
                lineTo(137.66f, 86.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.49f, 0.18f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, false, 0.41f, 11.37f)
                lineTo(136.69f, 108.0f)
                lineTo(126.0f, 118.64f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 137.36f, 130.0f)
                lineTo(148.0f, 119.31f)
                lineToRelative(10.34f, 10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, -0.43f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -0.6f, -11.1f)
                lineTo(159.31f, 108.0f)
                lineTo(176.0f, 91.31f)
                verticalLineToRelative(8.42f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, 7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f)
                close()
            }
        }
        .build()
        return `_gender-transgender-fill`!!
    }

private var `_gender-transgender-fill`: ImageVector? = null
