package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.CompassTool: ImageVector
    get() {
        if (_compassTool != null) {
            return _compassTool!!
        }
        _compassTool = Builder(name = "CompassTool", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.12f, 123.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.24f, -7.28f)
                arcToRelative(79.58f, 79.58f, 0.0f, false, true, -33.08f, 33.5f)
                lineToRelative(-18.24f, -41.05f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 136.0f, 44.91f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(44.91f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -13.56f, 63.9f)
                lineTo(56.69f, 220.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.62f, 6.5f)
                lineToRelative(25.14f, -56.56f)
                arcTo(95.48f, 95.48f, 0.0f, false, false, 128.0f, 176.0f)
                arcToRelative(99.13f, 99.13f, 0.0f, false, false, 31.6f, -5.21f)
                lineToRelative(25.09f, 56.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.62f, -6.5f)
                lineToRelative(-25.0f, -56.25f)
                arcTo(95.81f, 95.81f, 0.0f, false, false, 215.12f, 123.64f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(79.52f, 79.52f, 0.0f, false, true, -25.0f, -4.0f)
                lineToRelative(18.08f, -40.68f)
                arcToRelative(35.75f, 35.75f, 0.0f, false, false, 13.88f, 0.0f)
                lineToRelative(18.14f, 40.8f)
                arcTo(83.21f, 83.21f, 0.0f, false, true, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
