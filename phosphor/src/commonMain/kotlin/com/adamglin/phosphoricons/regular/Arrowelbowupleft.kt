package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Arrowelbowupleft: ImageVector
    get() {
        if (_arrowelbowupleft != null) {
            return _arrowelbowupleft!!
        }
        _arrowelbowupleft = Builder(name = "Arrowelbowupleft", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 80.0f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(67.31f)
                lineToRelative(34.35f, 34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineToRelative(-48.0f, -48.0f)
                lineToRelative(-0.06f, -0.07f)
                curveToRelative(-0.16f, -0.16f, -0.32f, -0.34f, -0.47f, -0.52f)
                lineToRelative(-0.23f, -0.31f)
                arcToRelative(3.71f, 3.71f, 0.0f, false, true, -0.23f, -0.32f)
                lineToRelative(-0.23f, -0.37f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, true, -0.17f, -0.3f)
                curveToRelative(-0.07f, -0.12f, -0.13f, -0.25f, -0.19f, -0.38f)
                reflectiveCurveToRelative(-0.1f, -0.21f, -0.15f, -0.33f)
                reflectiveCurveToRelative(-0.09f, -0.25f, -0.14f, -0.37f)
                lineToRelative(-0.13f, -0.36f)
                lineToRelative(-0.09f, -0.39f)
                curveToRelative(0.0f, -0.13f, -0.07f, -0.25f, -0.1f, -0.37f)
                reflectiveCurveToRelative(0.0f, -0.31f, -0.06f, -0.46f)
                reflectiveCurveToRelative(0.0f, -0.21f, -0.05f, -0.32f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, true, 0.0f, -1.58f)
                curveToRelative(0.0f, -0.11f, 0.0f, -0.21f, 0.05f, -0.32f)
                reflectiveCurveToRelative(0.0f, -0.31f, 0.06f, -0.46f)
                reflectiveCurveToRelative(0.06f, -0.24f, 0.1f, -0.37f)
                lineToRelative(0.09f, -0.39f)
                lineToRelative(0.13f, -0.36f)
                curveToRelative(0.05f, -0.12f, 0.09f, -0.25f, 0.14f, -0.37f)
                reflectiveCurveToRelative(0.1f, -0.22f, 0.15f, -0.33f)
                reflectiveCurveToRelative(0.12f, -0.26f, 0.19f, -0.38f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, true, 0.17f, -0.3f)
                lineToRelative(0.23f, -0.37f)
                arcToRelative(3.71f, 3.71f, 0.0f, false, true, 0.23f, -0.32f)
                lineToRelative(0.23f, -0.31f)
                curveToRelative(0.15f, -0.18f, 0.31f, -0.36f, 0.47f, -0.52f)
                lineToRelative(0.06f, -0.07f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(67.31f, 72.0f)
                horizontalLineTo(192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 80.0f)
                close()
            }
        }
        .build()
        return _arrowelbowupleft!!
    }

private var _arrowelbowupleft: ImageVector? = null
