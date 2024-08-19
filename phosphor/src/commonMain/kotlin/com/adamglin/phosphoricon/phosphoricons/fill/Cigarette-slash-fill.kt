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

public val FillGroup.`Cigarette-slash-fill`: ImageVector
    get() {
        if (`_cigarette-slash-fill` != null) {
            return `_cigarette-slash-fill`!!
        }
        `_cigarette-slash-fill` = Builder(name = "Cigarette-slash-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.0f, 60.08f)
                curveToRelative(8.0f, -14.23f, 7.42f, -21.71f, 6.36f, -24.91f)
                arcToRelative(7.79f, 7.79f, 0.0f, false, false, -2.64f, -3.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.5f, -14.62f)
                arcToRelative(22.57f, 22.57f, 0.0f, false, true, 11.32f, 13.44f)
                curveToRelative(3.36f, 10.14f, 0.81f, 22.85f, -7.6f, 37.79f)
                curveToRelative(-8.0f, 14.23f, -7.42f, 21.72f, -6.36f, 24.92f)
                arcToRelative(7.79f, 7.79f, 0.0f, false, false, 2.64f, 3.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -6.5f, 14.62f)
                arcToRelative(22.53f, 22.53f, 0.0f, false, true, -11.32f, -13.44f)
                curveTo(190.07f, 87.73f, 192.62f, 75.0f, 201.0f, 60.08f)
                close()
                moveTo(153.4f, 97.87f)
                arcToRelative(22.53f, 22.53f, 0.0f, false, false, 11.32f, 13.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 6.5f, -14.62f)
                arcToRelative(7.79f, 7.79f, 0.0f, false, true, -2.64f, -3.85f)
                curveToRelative(-1.06f, -3.2f, -1.64f, -10.69f, 6.36f, -24.92f)
                curveToRelative(8.41f, -14.94f, 11.0f, -27.65f, 7.6f, -37.79f)
                arcToRelative(22.57f, 22.57f, 0.0f, false, false, -11.32f, -13.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -6.5f, 14.62f)
                arcToRelative(7.79f, 7.79f, 0.0f, false, true, 2.64f, 3.86f)
                curveToRelative(1.06f, 3.2f, 1.64f, 10.68f, -6.36f, 24.91f)
                curveTo(152.62f, 75.0f, 150.07f, 87.73f, 153.43f, 97.87f)
                close()
                moveTo(213.89f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(175.37f, 192.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(85.19f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(160.82f, 176.0f)
                lineToRelative(-29.09f, -32.0f)
                lineTo(96.0f, 144.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(224.0f, 128.0f)
                lineTo(178.52f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                lineTo(224.0f, 144.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-1.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                lineTo(224.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_cigarette-slash-fill`!!
    }

private var `_cigarette-slash-fill`: ImageVector? = null
