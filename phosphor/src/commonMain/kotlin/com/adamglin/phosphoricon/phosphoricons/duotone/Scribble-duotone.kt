package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Scribble-duotone`: ImageVector
    get() {
        if (`_scribble-duotone` != null) {
            return `_scribble-duotone`!!
        }
        `_scribble-duotone` = Builder(name = "Scribble-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 40.0f)
                horizontalLineTo(200.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.67f, 189.66f)
                arcToRelative(14.61f, 14.61f, 0.0f, false, false, 0.0f, 20.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                arcToRelative(30.64f, 30.64f, 0.0f, false, true, 0.0f, -43.32f)
                lineToRelative(9.38f, -9.37f)
                arcTo(14.63f, 14.63f, 0.0f, false, false, 183.0f, 148.28f)
                lineTo(116.28f, 215.0f)
                arcTo(30.63f, 30.63f, 0.0f, false, true, 73.0f, 171.72f)
                lineTo(171.72f, 73.0f)
                arcTo(14.63f, 14.63f, 0.0f, false, false, 151.0f, 52.28f)
                lineTo(84.28f, 119.0f)
                arcTo(30.63f, 30.63f, 0.0f, false, true, 41.0f, 75.72f)
                lineTo(82.34f, 34.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 93.65f, 45.66f)
                lineTo(52.27f, 87.0f)
                arcTo(14.63f, 14.63f, 0.0f, false, false, 73.0f, 107.72f)
                lineTo(139.72f, 41.0f)
                arcTo(30.63f, 30.63f, 0.0f, false, true, 183.0f, 84.28f)
                lineTo(84.28f, 183.0f)
                arcTo(14.63f, 14.63f, 0.0f, false, false, 105.0f, 203.72f)
                lineTo(171.72f, 137.0f)
                arcTo(30.63f, 30.63f, 0.0f, false, true, 215.0f, 180.28f)
                close()
            }
        }
        .build()
        return `_scribble-duotone`!!
    }

private var `_scribble-duotone`: ImageVector? = null
