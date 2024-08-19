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

public val FillGroup.`Crown-cross-fill`: ImageVector
    get() {
        if (`_crown-cross-fill` != null) {
            return `_crown-cross-fill`!!
        }
        `_crown-cross-fill` = Builder(name = "Crown-cross-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 83.22f)
                arcToRelative(53.86f, 53.86f, 0.0f, false, false, -8.0f, -10.06f)
                verticalLineTo(40.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(73.16f)
                arcTo(53.86f, 53.86f, 0.0f, false, false, 128.0f, 83.22f)
                close()
                moveTo(180.0f, 56.0f)
                curveToRelative(-17.74f, 0.0f, -33.21f, 6.48f, -44.0f, 17.16f)
                verticalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(73.16f)
                curveTo(109.21f, 62.48f, 93.74f, 56.0f, 76.0f, 56.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f)
                curveToRelative(0.0f, 29.86f, 14.54f, 48.85f, 26.73f, 59.52f)
                arcTo(90.48f, 90.48f, 0.0f, false, false, 64.0f, 189.34f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(189.34f)
                arcToRelative(90.48f, 90.48f, 0.0f, false, false, 21.27f, -13.82f)
                curveTo(225.46f, 164.85f, 240.0f, 145.86f, 240.0f, 116.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 180.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_crown-cross-fill`!!
    }

private var `_crown-cross-fill`: ImageVector? = null
