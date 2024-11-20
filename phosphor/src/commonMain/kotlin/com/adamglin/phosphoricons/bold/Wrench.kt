package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.47f, 67.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.26f, -4.32f)
                lineTo(172.43f, 99.0f)
                lineToRelative(-12.68f, -2.72f)
                lineTo(157.0f, 83.57f)
                lineToRelative(35.79f, -38.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.32f, -19.26f)
                arcTo(76.07f, 76.07f, 0.0f, false, false, 88.41f, 121.64f)
                lineTo(30.92f, 174.18f)
                arcToRelative(4.68f, 4.68f, 0.0f, false, false, -0.39f, 0.38f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 50.91f, 50.91f)
                lineToRelative(0.38f, -0.39f)
                lineToRelative(52.54f, -57.49f)
                arcTo(76.05f, 76.05f, 0.0f, false, false, 230.47f, 67.5f)
                close()
                moveTo(160.0f, 148.0f)
                arcToRelative(51.5f, 51.5f, 0.0f, false, true, -23.35f, -5.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.26f, 2.62f)
                lineTo(64.31f, 208.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(63.55f, -58.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.62f, -14.26f)
                arcTo(51.5f, 51.5f, 0.0f, false, true, 108.0f, 96.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, 52.0f, -52.0f)
                horizontalLineToRelative(0.89f)
                lineTo(135.17f, 71.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.91f, 10.65f)
                lineToRelative(5.66f, 26.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.21f, 9.21f)
                lineToRelative(26.35f, 5.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.65f, -2.91f)
                lineTo(212.0f, 95.12f)
                curveToRelative(0.0f, 0.3f, 0.0f, 0.59f, 0.0f, 0.89f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 160.0f, 148.0f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
