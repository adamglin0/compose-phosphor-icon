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

public val BoldGroup.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.79f, 52.62f)
                lineToRelative(-96.0f, -32.0f)
                arcToRelative(11.85f, 11.85f, 0.0f, false, false, -7.58f, 0.0f)
                lineToRelative(-96.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 63.37f)
                arcTo(6.05f, 6.05f, 0.0f, false, false, 20.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(44.0f, 80.65f)
                lineToRelative(23.71f, 7.9f)
                arcToRelative(67.92f, 67.92f, 0.0f, false, false, 18.42f, 85.0f)
                arcTo(100.36f, 100.36f, 0.0f, false, false, 46.0f, 209.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.1f, 13.11f)
                curveTo(80.37f, 200.59f, 103.0f, 188.0f, 128.0f, 188.0f)
                reflectiveCurveToRelative(47.63f, 12.59f, 61.95f, 34.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.1f, -13.11f)
                arcToRelative(100.36f, 100.36f, 0.0f, false, false, -40.18f, -35.92f)
                arcToRelative(67.92f, 67.92f, 0.0f, false, false, 18.42f, -85.0f)
                lineToRelative(39.5f, -13.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -22.76f)
                close()
                moveTo(128.0f, 44.62f)
                lineTo(186.05f, 64.0f)
                lineTo(128.0f, 83.35f)
                lineTo(70.0f, 64.0f)
                close()
                moveTo(172.0f, 120.0f)
                arcTo(44.0f, 44.0f, 0.0f, true, true, 90.94f, 96.29f)
                lineToRelative(33.27f, 11.09f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 7.58f, 0.0f)
                lineToRelative(33.27f, -11.09f)
                arcTo(43.85f, 43.85f, 0.0f, false, true, 172.0f, 120.0f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
