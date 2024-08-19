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

public val BoldGroup.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.73f, 210.63f)
                lineToRelative(-56.0f, -112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.46f, 0.0f)
                lineToRelative(-20.52f, 41.0f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 114.0f, 126.22f)
                arcTo(107.48f, 107.48f, 0.0f, false, false, 139.33f, 68.0f)
                horizontalLineTo(160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(108.0f)
                verticalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(44.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(83.13f)
                arcTo(83.69f, 83.69f, 0.0f, false, true, 96.0f, 110.35f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 83.6f, 91.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -21.81f, 10.0f)
                arcTo(107.55f, 107.55f, 0.0f, false, false, 78.0f, 126.24f)
                arcTo(83.54f, 83.54f, 0.0f, false, true, 32.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(107.47f, 107.47f, 0.0f, false, false, 64.0f, -21.07f)
                arcToRelative(108.4f, 108.4f, 0.0f, false, false, 45.39f, 19.44f)
                lineToRelative(-24.13f, 48.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.46f, 10.73f)
                lineTo(151.41f, 196.0f)
                horizontalLineToRelative(65.17f)
                lineToRelative(12.68f, 25.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.47f, -10.73f)
                close()
                moveTo(163.41f, 172.0f)
                lineTo(184.0f, 130.83f)
                lineTo(204.58f, 172.0f)
                close()
            }
        }
        .build()
        return _translate!!
    }

private var _translate: ImageVector? = null
