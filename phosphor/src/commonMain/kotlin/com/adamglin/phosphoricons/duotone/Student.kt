package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                lineTo(128.0f, 96.0f)
                lineTo(32.0f, 64.0f)
                lineToRelative(96.0f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.53f, 56.41f)
                lineToRelative(-96.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.06f, 0.0f)
                lineToRelative(-96.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.4f, 6.75f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(75.1f)
                lineTo(73.59f, 86.29f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 20.65f, 88.05f)
                curveToRelative(-18.0f, 7.06f, -33.56f, 19.83f, -44.94f, 37.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.4f, 8.74f)
                curveTo(77.77f, 197.25f, 101.57f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(50.23f, 13.25f, 65.3f, 36.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.4f, -8.74f)
                curveToRelative(-11.38f, -17.46f, -27.0f, -30.23f, -44.94f, -37.29f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 20.65f, -88.0f)
                lineToRelative(44.12f, -14.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -15.18f)
                close()
                moveTo(176.0f, 120.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 89.35f, 91.55f)
                lineToRelative(36.12f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.06f, 0.0f)
                lineToRelative(36.12f, -12.0f)
                arcTo(47.89f, 47.89f, 0.0f, false, true, 176.0f, 120.0f)
                close()
                moveTo(128.0f, 87.57f)
                lineTo(57.3f, 64.0f)
                lineTo(128.0f, 40.43f)
                lineTo(198.7f, 64.0f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
