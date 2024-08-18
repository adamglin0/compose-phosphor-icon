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

public val FillGroup.`File-md-fill`: ImageVector
    get() {
        if (`_file-md-fill` != null) {
            return `_file-md-fill`!!
        }
        `_file-md-fill` = Builder(name = "File-md-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 82.34f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(196.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.19f, 7.91f)
                arcToRelative(8.15f, 8.15f, 0.0f, false, false, 6.81f, -8.16f)
                lineTo(216.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f)
                close()
                moveTo(152.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                close()
                moveTo(144.0f, 144.0f)
                lineTo(128.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(15.32f)
                curveToRelative(19.66f, 0.0f, 36.21f, -15.48f, 36.67f, -35.13f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 144.0f, 144.0f)
                close()
                moveTo(143.51f, 200.0f)
                lineTo(136.0f, 200.0f)
                lineTo(136.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.77f)
                curveTo(163.58f, 191.59f, 154.34f, 200.0f, 143.51f, 200.0f)
                close()
                moveTo(104.0f, 152.0f)
                verticalLineToRelative(55.73f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 96.53f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 208.0f)
                lineTo(88.0f, 177.38f)
                lineToRelative(-13.32f, 19.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -4.2f, 3.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.0f, -3.0f)
                lineTo(48.0f, 177.38f)
                verticalLineToRelative(30.35f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 40.53f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 208.0f)
                lineTo(32.0f, 152.31f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, true, 4.56f, -7.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, 2.63f)
                lineTo(68.0f, 178.05f)
                lineToRelative(21.27f, -30.39f)
                arcToRelative(8.28f, 8.28f, 0.0f, false, true, 8.06f, -3.55f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_file-md-fill`!!
    }

private var `_file-md-fill`: ImageVector? = null
