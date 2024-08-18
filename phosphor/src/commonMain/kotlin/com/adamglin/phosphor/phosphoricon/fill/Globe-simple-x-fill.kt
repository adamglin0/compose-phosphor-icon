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

public val FillGroup.`Globe-simple-x-fill`: ImageVector
    get() {
        if (`_globe-simple-x-fill` != null) {
            return `_globe-simple-x-fill`!!
        }
        `_globe-simple-x-fill` = Builder(name = "Globe-simple-x-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.66f, 173.66f)
                lineTo(203.31f, 192.0f)
                lineToRelative(18.35f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(192.0f, 203.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(180.69f, 192.0f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(192.0f, 180.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(232.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(96.25f)
                curveToRelative(3.0f, 53.73f, 35.33f, 80.6f, 36.77f, 81.77f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 232.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 128.0f)
                close()
                moveTo(148.41f, 42.4f)
                curveTo(159.94f, 57.67f, 174.0f, 83.49f, 175.79f, 120.0f)
                horizontalLineToRelative(39.84f)
                arcTo(88.19f, 88.19f, 0.0f, false, false, 148.41f, 42.4f)
                close()
                moveTo(96.23f, 120.0f)
                horizontalLineToRelative(63.54f)
                curveTo(157.46f, 78.4f, 137.55f, 52.9f, 128.0f, 43.0f)
                curveTo(118.46f, 52.89f, 98.54f, 78.39f, 96.23f, 120.0f)
                close()
            }
        }
        .build()
        return `_globe-simple-x-fill`!!
    }

private var `_globe-simple-x-fill`: ImageVector? = null
