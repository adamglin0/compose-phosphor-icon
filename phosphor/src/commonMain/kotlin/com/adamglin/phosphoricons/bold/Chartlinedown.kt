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

public val BoldGroup.Chartlinedown: ImageVector
    get() {
        if (_chartlinedown != null) {
            return _chartlinedown!!
        }
        _chartlinedown = Builder(name = "Chartlinedown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineTo(59.0f)
                lineToRelative(52.0f, 52.0f)
                lineToRelative(23.51f, -23.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineTo(188.0f, 139.0f)
                verticalLineTo(128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(40.0f)
                quadToRelative(0.0f, 0.6f, -0.06f, 1.2f)
                curveToRelative(0.0f, 0.16f, -0.05f, 0.33f, -0.07f, 0.49f)
                reflectiveCurveToRelative(-0.06f, 0.45f, -0.1f, 0.67f)
                reflectiveCurveToRelative(-0.09f, 0.38f, -0.14f, 0.56f)
                reflectiveCurveToRelative(-0.09f, 0.39f, -0.15f, 0.58f)
                lineToRelative(-0.19f, 0.54f)
                curveToRelative(-0.07f, 0.19f, -0.13f, 0.38f, -0.21f, 0.56f)
                reflectiveCurveToRelative(-0.15f, 0.34f, -0.23f, 0.5f)
                reflectiveCurveToRelative(-0.17f, 0.38f, -0.27f, 0.57f)
                reflectiveCurveToRelative(-0.18f, 0.3f, -0.27f, 0.45f)
                reflectiveCurveToRelative(-0.21f, 0.38f, -0.33f, 0.56f)
                reflectiveCurveToRelative(-0.24f, 0.32f, -0.36f, 0.47f)
                reflectiveCurveToRelative(-0.22f, 0.32f, -0.34f, 0.47f)
                reflectiveCurveToRelative(-0.46f, 0.53f, -0.71f, 0.78f)
                lineToRelative(-0.08f, 0.1f)
                lineToRelative(-0.1f, 0.08f)
                curveToRelative(-0.25f, 0.25f, -0.51f, 0.48f, -0.78f, 0.71f)
                lineToRelative(-0.46f, 0.34f)
                curveToRelative(-0.16f, 0.12f, -0.32f, 0.25f, -0.48f, 0.36f)
                reflectiveCurveToRelative(-0.37f, 0.22f, -0.55f, 0.33f)
                reflectiveCurveToRelative(-0.3f, 0.19f, -0.46f, 0.27f)
                reflectiveCurveToRelative(-0.37f, 0.18f, -0.56f, 0.27f)
                reflectiveCurveToRelative(-0.33f, 0.16f, -0.51f, 0.23f)
                lineToRelative(-0.54f, 0.21f)
                lineToRelative(-0.57f, 0.19f)
                arcToRelative(4.92f, 4.92f, 0.0f, false, true, -0.55f, 0.14f)
                lineToRelative(-0.58f, 0.15f)
                lineToRelative(-0.64f, 0.09f)
                lineToRelative(-0.53f, 0.08f)
                arcTo(11.51f, 11.51f, 0.0f, false, true, 200.0f, 180.0f)
                horizontalLineTo(160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(11.0f)
                lineToRelative(-43.0f, -43.0f)
                lineToRelative(-23.51f, 23.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(44.0f, 93.0f)
                verticalLineTo(196.0f)
                horizontalLineTo(224.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 208.0f)
                close()
            }
        }
        .build()
        return _chartlinedown!!
    }

private var _chartlinedown: ImageVector? = null
