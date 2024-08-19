package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.27f, 60.21f)
                lineToRelative(-96.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.54f, 0.0f)
                lineToRelative(-96.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(69.55f)
                lineTo(79.88f, 84.18f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 24.54f, 91.0f)
                curveToRelative(-20.86f, 5.74f, -39.0f, 19.13f, -51.77f, 38.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.7f, 4.36f)
                curveTo(75.17f, 193.92f, 100.2f, 180.0f, 128.0f, 180.0f)
                reflectiveCurveToRelative(52.83f, 13.92f, 68.65f, 38.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.7f, -4.36f)
                curveToRelative(-12.72f, -19.52f, -30.91f, -32.91f, -51.77f, -38.65f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 24.54f, -91.0f)
                lineToRelative(49.15f, -16.39f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.58f)
                close()
                moveTo(180.0f, 120.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 87.93f, 86.86f)
                lineToRelative(38.8f, 12.93f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, false, 2.54f, 0.0f)
                lineToRelative(38.8f, -12.93f)
                arcTo(51.85f, 51.85f, 0.0f, false, true, 180.0f, 120.0f)
                close()
                moveTo(128.0f, 91.78f)
                lineTo(44.65f, 64.0f)
                lineTo(128.0f, 36.22f)
                lineTo(211.35f, 64.0f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
