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

public val FillGroup.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) {
            return _userCircleMinus!!
        }
        _userCircleMinus = Builder(name = "UserCircleMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 76.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 128.0f, 76.0f)
                close()
                moveTo(176.0f, 64.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(176.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(215.87f, 88.46f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 211.0f, 98.67f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -17.23f, 87.74f)
                arcTo(79.86f, 79.86f, 0.0f, false, false, 172.0f, 165.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.84f, 0.32f)
                arcToRelative(59.81f, 59.81f, 0.0f, false, true, -78.27f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 84.0f, 165.1f)
                arcToRelative(79.71f, 79.71f, 0.0f, false, false, -21.79f, 21.31f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f)
                arcToRelative(88.76f, 88.76f, 0.0f, false, true, 14.68f, 1.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.64f, -15.78f)
                arcToRelative(103.9f, 103.9f, 0.0f, true, false, 80.76f, 67.89f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 215.87f, 88.46f)
                close()
            }
        }
        .build()
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
