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

public val FillGroup.`File-py-fill`: ImageVector
    get() {
        if (`_file-py-fill` != null) {
            return `_file-py-fill`!!
        }
        `_file-py-fill` = Builder(name = "File-py-fill", defaultWidth = 256.0.dp, defaultHeight =
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
                lineTo(172.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(176.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f)
                close()
                moveTo(152.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                close()
                moveTo(64.0f, 144.0f)
                lineTo(48.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(55.73f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 47.47f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 208.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(7.4f)
                curveToRelative(15.24f, 0.0f, 28.14f, -11.92f, 28.59f, -27.15f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 64.0f, 144.0f)
                close()
                moveTo(63.65f, 184.0f)
                lineTo(56.0f, 184.0f)
                lineTo(56.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 13.16f)
                arcTo(12.25f, 12.25f, 0.0f, false, true, 63.65f, 184.0f)
                close()
                moveTo(154.65f, 156.52f)
                lineTo(136.0f, 186.29f)
                verticalLineToRelative(21.44f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f)
                lineTo(120.0f, 186.29f)
                lineToRelative(-18.61f, -29.77f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, 2.16f, -11.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.23f, 2.41f)
                lineTo(128.0f, 168.91f)
                lineToRelative(13.22f, -21.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.23f, -2.41f)
                arcTo(8.22f, 8.22f, 0.0f, false, true, 154.61f, 156.52f)
                close()
            }
        }
        .build()
        return `_file-py-fill`!!
    }

private var `_file-py-fill`: ImageVector? = null
