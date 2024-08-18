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

public val FillGroup.`Recycle-fill`: ImageVector
    get() {
        if (`_recycle-fill` != null) {
            return `_recycle-fill`!!
        }
        `_recycle-fill` = Builder(name = "Recycle-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -20.77f, -36.0f)
                lineToRelative(28.0f, -48.3f)
                lineToRelative(-13.82f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 35.33f, 109.0f)
                lineToRelative(32.77f, -8.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.8f, 5.66f)
                lineToRelative(8.79f, 32.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.73f, 9.0f)
                lineToRelative(-13.88f, -8.0f)
                lineTo(33.11f, 188.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 200.0f)
                horizontalLineTo(88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 208.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(7.85f, 7.85f, 0.0f, false, true, 6.92f, 4.0f)
                lineToRelative(28.0f, 48.3f)
                lineToRelative(-13.82f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 151.0f, 106.92f)
                lineToRelative(32.78f, 8.79f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, 2.07f, 0.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.72f, -5.93f)
                lineToRelative(8.79f, -32.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.72f, -9.0f)
                lineToRelative(-13.89f, 8.0f)
                lineTo(148.77f, 28.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -41.54f, 0.0f)
                lineTo(84.07f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.85f, 8.0f)
                lineToRelative(23.16f, -40.0f)
                arcTo(7.85f, 7.85f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(236.73f, 180.0f)
                lineToRelative(-23.14f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.84f, 8.0f)
                lineToRelative(23.14f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 200.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.66f, -5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(24.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 232.0f)
                verticalLineTo(216.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 20.77f, -36.0f)
                close()
            }
        }
        .build()
        return `_recycle-fill`!!
    }

private var `_recycle-fill`: ImageVector? = null
