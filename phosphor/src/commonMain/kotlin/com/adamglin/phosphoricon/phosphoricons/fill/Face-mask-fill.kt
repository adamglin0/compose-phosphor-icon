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

public val FillGroup.`Face-mask-fill`: ImageVector
    get() {
        if (`_face-mask-fill` != null) {
            return `_face-mask-fill`!!
        }
        `_face-mask-fill` = Builder(name = "Face-mask-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 72.0f)
                horizontalLineToRelative(-0.85f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.68f, -10.0f)
                lineTo(133.47f, 33.0f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, false, -10.94f, 0.0f)
                lineToRelative(-80.0f, 29.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.68f, 10.0f)
                lineTo(32.0f, 72.09f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 0.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(5.19f)
                curveToRelative(7.19f, 15.8f, 21.79f, 29.43f, 43.23f, 40.16f)
                arcToRelative(191.16f, 191.16f, 0.0f, false, false, 46.15f, 15.71f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 2.86f, 0.0f)
                arcToRelative(191.16f, 191.16f, 0.0f, false, false, 46.15f, -15.71f)
                curveToRelative(21.44f, -10.73f, 36.0f, -24.36f, 43.23f, -40.16f)
                lineTo(224.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(256.0f, 104.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 224.0f, 72.0f)
                close()
                moveTo(32.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 88.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(58.74f, 58.74f, 0.0f, false, false, 0.55f, 8.0f)
                close()
                moveTo(168.0f, 144.0f)
                lineTo(88.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(168.0f, 112.0f)
                lineTo(88.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(240.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineToRelative(-0.55f)
                arcToRelative(58.74f, 58.74f, 0.0f, false, false, 0.55f, -8.0f)
                lineTo(224.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_face-mask-fill`!!
    }

private var `_face-mask-fill`: ImageVector? = null
