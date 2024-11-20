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

public val BoldGroup.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) {
            return _pipeWrench!!
        }
        _pipeWrench = Builder(name = "PipeWrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.11f, 40.2f)
                lineToRelative(-0.36f, -0.35f)
                lineTo(185.92f, 9.64f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.0f, 0.19f)
                lineTo(110.36f, 57.11f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.46f, 45.0f)
                lineToRelative(-15.06f, 15.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f)
                lineToRelative(17.72f, 17.72f)
                lineToRelative(-30.2f, 30.2f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.26f, 45.26f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(91.51f, -92.32f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.38f, -28.61f)
                lineToRelative(-13.0f, -12.4f)
                lineToRelative(11.91f, -11.8f)
                lineToRelative(14.73f, 13.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.0f, -0.33f)
                lineToRelative(3.71f, -3.71f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -62.23f)
                close()
                moveTo(69.65f, 131.32f)
                lineToRelative(12.21f, -12.19f)
                lineTo(96.73f, 134.0f)
                lineToRelative(-12.2f, 12.21f)
                close()
                moveTo(65.65f, 221.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -11.33f)
                lineToRelative(67.86f, -67.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(82.33f, 85.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 93.65f, 74.34f)
                curveToRelative(0.06f, 0.07f, 0.13f, 0.13f, 0.19f, 0.19f)
                lineToRelative(60.44f, 57.72f)
                close()
                moveTo(202.14f, 85.46f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(186.27f, 73.44f)
                arcToRelative(20.06f, 20.06f, 0.0f, false, false, -27.82f, 0.38f)
                lineToRelative(-15.0f, 14.88f)
                lineToRelative(-15.72f, -15.0f)
                lineTo(172.1f, 29.53f)
                lineToRelative(30.19f, 27.8f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -0.15f, 28.13f)
                close()
            }
        }
        .build()
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
